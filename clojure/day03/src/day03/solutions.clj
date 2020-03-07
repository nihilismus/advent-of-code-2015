(ns day03.solutions
  (:require [clojure.set :as set]))

(defn- next-position [position direction]
  (let [{x :x y :y} position]
    (case direction
      \^ {:x x :y (inc y)}
      \v {:x x :y (dec y)}
      \> {:x (inc x) :y y}
      \< {:x (dec x) :y y}
      position)))

(defn- visited-positions [directions]
  (loop [visited-positions #{}
         current-position {:x 0 :y 0}
         directions directions]
    (if (empty? directions)
      (conj visited-positions current-position)
      (recur (conj visited-positions current-position)
             (next-position current-position (first directions))
             (rest directions)))))

(defn solution1 [characters]
  (->> characters
       (visited-positions)
       (count)))

(defn- directions-for-santa [characters]
  (keep-indexed (fn [i v] (if (even? i) v))
                characters))

(defn- directions-for-robot-santa [characters]
  (keep-indexed (fn [i v] (if (odd? i) v))
                characters))

(defn solution2 [characters]
  (->> (set/union (->> characters
                       (directions-for-santa)
                       (visited-positions))
                  (->> characters
                       (directions-for-robot-santa)
                       (visited-positions)))
       (count)))

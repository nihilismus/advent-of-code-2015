(ns day02.solutions
  (:require [clojure.string :as str]))

(defn- box-dimensions->integers [box-dimensions]
  (->> (str/split box-dimensions #"x")
       (map #(Integer/parseInt %))))

(defn- surface-area-of-a-box [[l w h]]
  (+ (* 2 l w)
     (* 2 w h)
     (* 2 h l)))

(defn- smallest-surface-area-of-a-box [[l w h]]
  (min (* l w)
       (* w h)
       (* h l)))

(defn- paper-needed-for-a-box [acc dimensions]
  (+ acc
     (surface-area-of-a-box dimensions)
     (smallest-surface-area-of-a-box dimensions)))

(defn solution1 [boxes-dimensions]
  (->> boxes-dimensions
       (str/split-lines)
       (map box-dimensions->integers)
       (reduce paper-needed-for-a-box 0)))

(defn- ribbon-needed-to-wrap-a-box [dimensions]
  (let [xs (sort dimensions)
        a (first xs)
        b (first (rest xs))]
    (+ (+ a a) (+ b b))))

(defn- ribbon-needed-for-the-bow-of-a-box [dimensions]
  (apply * dimensions))

(defn- ribbon-needed-for-a-box [acc dimensions]
  (+ acc
     (ribbon-needed-to-wrap-a-box dimensions)
     (ribbon-needed-for-the-bow-of-a-box dimensions)))

(defn solution2 [boxes-dimensions]
  (->> boxes-dimensions
       (str/split-lines)
       (map box-dimensions->integers)
       (reduce ribbon-needed-for-a-box 0)))

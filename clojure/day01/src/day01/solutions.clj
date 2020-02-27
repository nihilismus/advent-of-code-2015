(ns day01.solutions)

(defn- character->one [character]
  (if (= \( character) 1 -1))

(defn solution1 [characters]
  (->> characters
       (map character->one)
       (reduce +)))

(defn- position-for-basement [ones]
  (loop [total    0
         position 0
         ones     ones]
    (if (== total -1)
      position
      (recur (+ total (first ones))
             (inc position)
             (rest ones)))))

(defn solution2 [characters]
  (->> characters
       (map character->one)
       (position-for-basement)))

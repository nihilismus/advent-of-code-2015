(ns day04.core
  (:gen-class)
  (:require [day04.solutions :as solutions]))

(defn part1 [input]
  (->> input
       (solutions/solution1)
       (println "Part 01: ")))

(defn part2 [input]
  (->> input
       (solutions/solution2)
       (println "Part 02: ")))

(defn -main
  [& args]
  (let [input (slurp (first args))]
    (part1 input)
    (part2 input)))

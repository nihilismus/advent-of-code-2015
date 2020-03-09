(ns day04.solutions
  (:use [digest :only (md5)]
        [clojure.string :only (trim trim-newline)]))

(defn- first-digits-are-zeros? [message number-of-digits]
  (->> (md5 message)
       (take number-of-digits)
       (apply = \0)))

(defn- lowest-positive-number [secret-key number-of-digits]
  (loop [number 1]
    (if (first-digits-are-zeros? (str secret-key number)
                                 number-of-digits)
      number
      (recur (inc number)))))

(defn solution1 [secret-key]
  (let [trimmed-secret-key (trim (trim-newline secret-key))]
    (lowest-positive-number trimmed-secret-key 5)))

(defn solution2 [secret-key]
  (let [trimmed-secret-key (trim (trim-newline secret-key))]
    (lowest-positive-number trimmed-secret-key 6)))

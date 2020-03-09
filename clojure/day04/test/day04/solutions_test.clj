(ns day04.solutions-test
  (:require [clojure.test :refer :all]
            [day04.solutions :refer :all]))

(deftest test-01-01
  (testing "Test 01 - 01"
    (is (= (solution1 "abcdef") 609043))))

(deftest test-01-02
  (testing "Test 01 - 02"
    (is (= (solution1 "pqrstuv") 1048970))))

(deftest test-01-03
  (testing "Test 01 - 03"
    (is (= (solution1 "") 1803305))))

(deftest test-02-01
  (testing "Test 02 - 01"
    (is (= (solution2 "abcdef") 6742839))))

(deftest test-02-02
  (testing "Test 02 - 02"
    (is (= (solution2 "pqrstuv") 5714438))))

(deftest test-02-03
  (testing "Test 02 - 03"
    (is (= (solution2 "") 20412333))))

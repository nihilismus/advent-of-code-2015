(ns day02.solutions-test
  (:require [clojure.test :refer :all]
            [day02.solutions :refer :all]))

(deftest test-01-01
  (testing "Test 01 - 01"
    (is (= (solution1 "2x3x4\n1x1x10") 101))))

(deftest test-01-02
  (testing "Test 01 - 02"
    (is (= (solution1 "3x2x4\n10x1x1") 101))))

(deftest test-01-03
  (testing "Test 01 - 03"
    (is (= (solution1 "4x3x2\n1x10x1") 101))))

(deftest test-02-01
  (testing "Test 02 - 01"
    (is (= (solution2 "2x3x4\n1x1x10") 48))))

(deftest test-02-02
  (testing "Test 02 - 02"
    (is (= (solution2 "3x2x4\n10x1x1") 48))))

(deftest test-02-03
  (testing "Test 02 - 03"
    (is (= (solution2 "4x3x2\n1x10x1") 48))))

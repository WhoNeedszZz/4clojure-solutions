(ns fourclojuresolutions.easy
  (:gen-class))

(defn lastEl
  "Write a function which returns the last element in a sequence"
  [sequ]
  (first (reverse sequ)))

(defn penultimate
  "Write a function which returns the second to last element from a sequence"
  [sequ]
  (first (rest (reverse sequ))))

(defn nthEl
  "Write a function which returns the Nth element from a sequence"
  ([sequ n] (if (= n 0) (nthEl sequ) (nthEl (rest sequ) (- n 1))))
  ([sequ] (first sequ)))

(defn numEl
  "Write a function which returns the total number of elements in a sequence"
  ([sequ size] (if (= (rest sequ) '()) size (numEl (rest sequ) (+ size 1))))
  ([sequ] (numEl sequ 1)))

(defn revSeq
  "Write a function which reverses a sequence"
  ([sequ rev] (if (= (count sequ) 0) rev (revSeq (rest sequ) (conj rev (first sequ)))))
  ([sequ] (revSeq sequ '())))

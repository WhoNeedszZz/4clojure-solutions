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

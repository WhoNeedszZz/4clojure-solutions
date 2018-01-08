(ns fourclojuresolutions.easy
  (:gen-class))

(defn lastEl
  "Write a function which returns the last element in a sequence"
  [sequ]
  (first (reverse sequ)))

(ns fourclojuresolutions.easy.core-functions
  (:gen-class))

(defn maxValue
  "Write a function which takes a variable number of parameters and returns the maximum value"
  ([a] a)
  ([a b] (if (> a b) a b))
  ([a b & more] (reduce maxValue (maxValue a b) more)))

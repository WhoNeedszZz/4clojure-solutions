(ns fourclojuresolutions.core
  (:gen-class)
  (:require
    [fourclojuresolutions.easy.seqs :as easy-seqs]
    [fourclojuresolutions.easy.core-functions :as easy-core-f]))

(defn easy-solutions []
  (do
    (println "Last element")
    (println (easy-seqs/lastEl [1 2 3 4 5]))
    (println (easy-seqs/lastEl '(5 4 3)))
    (println (easy-seqs/lastEl ["b" "c" "d"]))
    (println "Penultimate")
    (println (easy-seqs/penultimate (list 1 2 3 4 5)))
    (println (easy-seqs/penultimate ["a" "b" "c"]))
    (println (easy-seqs/penultimate [[1 2] [3 4]]))
    (println "Nth element")
    (println (easy-seqs/nthEl '(4 5 6 7) 2))
    (println (easy-seqs/nthEl [:a :b :c] 0))
    (println (easy-seqs/nthEl [1 2 3 4] 1))
    (println (easy-seqs/nthEl '([1 2] [3 4] [5 6]) 2))
    (println "Count sequence")
    (println (easy-seqs/numEl '(1 2 3 3 1)))
    (println (easy-seqs/numEl "Hello World"))
    (println (easy-seqs/numEl [[1 2] [3 4] [5 6]]))
    (println (easy-seqs/numEl '(13)))
    (println (easy-seqs/numEl '(:a :b :c)))
    (println "Reverse a sequence")
    (println (easy-seqs/revSeq [1 2 3 4 5]))
    (println (easy-seqs/revSeq (sorted-set 5 7 2 7)))
    (println (easy-seqs/revSeq [[1 2] [3 4] [5 6]]))
    (println "Sum of sequence of numbers")
    (println (easy-seqs/sumSeq [1 2 3]))
    (println (easy-seqs/sumSeq (list 0 -2 5 5)))
    (println (easy-seqs/sumSeq #{4 2 1}))
    (println (easy-seqs/sumSeq '(0 0 -1)))
    (println (easy-seqs/sumSeq '(1 10 3)))
    (println "Return odd numbers")
    (println (easy-seqs/oddSeq #{1 2 3 4 5}))
    (println (easy-seqs/oddSeq [4 2 1 6]))
    (println (easy-seqs/oddSeq [2 2 4 6]))
    (println (easy-seqs/oddSeq [1 1 1 3]))
    (println "First x fib nums")
    (println (easy-seqs/firstXFib 3))
    (println (easy-seqs/firstXFib 6))
    (println (easy-seqs/firstXFib 8))
    (println "Palindrome detector")
    (println (easy-seqs/isPalindrome '(1 2 3 4 5)))
    (println (easy-seqs/isPalindrome "racecar"))
    (println (easy-seqs/isPalindrome [:foo :bar :foo]))
    (println (easy-seqs/isPalindrome '(1 1 3 3 1 1)))
    (println (easy-seqs/isPalindrome '(:a :b :c)))))

(defn easy-core-funcs
  "Easy core functions"
  []
  (do
    (println "Core functions")
    (println)
    (println "Max value")
    (println (easy-core-f/maxValue 1 8 3 4))
    (println (easy-core-f/maxValue 30 20))
    (println (easy-core-f/maxValue 45 67 11))))

(defn -main
  "4Clojure solutions"
  [& args]
  (do
    (println "Easy solutions:")
    (println)
    (easy-solutions)
    (println)
    (easy-core-funcs)))

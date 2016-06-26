(ns clojure-99-problems.p09)

;; Pack consecutive duplicates of list elements into sublists.
;; pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
;; returns, List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

(defn pack [a-seq]
  (cond
    (empty? a-seq) '()
    :else (let [val (first a-seq)]
            (cons (take-while (fn [x] (= x val)) a-seq)
                  (pack (drop-while (fn [x] (= x val)) a-seq))))))

;; Trivial test cases

(pack [1 2 3])

(pack [1 1 1])

(pack [1])

(pack [])

(pack [1 1 1 2 2 2 3 3 4]) ;; => ((1 1 1) (2 2 2) (3 3) (4))

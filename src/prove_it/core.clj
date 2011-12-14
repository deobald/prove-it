(ns prove-it.core)

;; where the shit did clojure.contrib.math go?
(defn exp [i e]
  (.pow (BigInteger. (str i)) e))

;; ha! yes, really.
(def factorial
  (fn [n]
    (loop [cnt n acc 1]
      (if (zero? cnt)
        acc
        (recur (dec cnt) (* acc cnt))))))

(defn intro-2 []
  (let [make-tri (fn [n] [n
                         ;;(- (exp 3 n) 1)
                         (- (exp 3 n) (exp 2 n))])]
    (map make-tri (range 1 20))))

(defn intro-3-a []
  (+ 1 (* 2 3 5 7)))

(defn intro-3-b []
  (+ 1 (* 2 5 11)))

(defn intro-4 []
  (let [n 5
        x (+ 2 (factorial (+ n 1)))]
    (for [i (range 0 n)]
      (+ x i))))
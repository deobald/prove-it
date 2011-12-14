(ns prove-it.core)

;; where the shit did clojure.contrib.math go?
(defn exp [i e]
  (.pow (BigInteger. (str i)) e))

(defn intro-2 []
  (let [make-tri (fn [n] [n
                         ;;(- (exp 3 n) 1)
                         (- (exp 3 n) (exp 2 n))])]
    (map make-tri (range 1 20))))
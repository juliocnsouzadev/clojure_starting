(ns exer(:gen-class))

(def numeros [1 2 3 4 5])

(def carros [5000.0 6000.0])

(defn pares [numeros]
  (remove (fn [nro] (= (rem nro 2) 1)) numeros)
  )

(defn mult [numeros]
  (map (fn [nro] (* 3 nro)) numeros)
  )

(defn filtra [numeros]
  (filter (fn [x] (or (< x 2) (> x 4))) numeros)
  )

(def palavra "ALURA")

(defn contem [palavra letras]
  (map (fn [letra] (contains? letras (str letra)) ) palavra)
  )


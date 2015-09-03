(ns forca.core (:gen-class))

(def total-de-vidas 6)

(defn loose
  []
  (println "You loose!")
  )

(defn win
  []
  (println "You Win!")
  )

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra)) ) palavra)
  )

(defn acertou-palavra-completa? [palavra acertos] 
  (empty? (letras-faltantes palavra acertos))
  )

(defn jogo [vidas palavra acertos]
  (if(= vidas 0)
    (loose)
    (if(acertou-palavra-completa? palavra acertos)
      (win)
      (print "Tente outra vez!")
      
      )
    
    )  
  )

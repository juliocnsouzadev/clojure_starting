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

(defn letras-faltantes []

)

(defn acertou-palavra-completa? [palavra acertos] 
  
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

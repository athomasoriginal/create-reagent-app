(ns clj.new.create-reagent-app
  "Generate a reagent app"
  (:require [clj.new.templates :as cnt]))


(defn create-reagent-app
  "Reagent app template."
  [name]
  (let [render  (cnt/renderer "create_reagent_app")
        main-ns (cnt/multi-segment (cnt/sanitize-ns name))
        data    {:raw-name    name
                 :name        (cnt/project-name name)
                 :namespace   main-ns
                 :nested-dirs (cnt/name-to-path main-ns)
                 :year        (cnt/year)
                 :date        (cnt/date)}]
     (println "Generating a reagent app: " (cnt/project-name name))
     (cnt/->files data
                  ["deps.edn"                       (render "deps.edn" data)]
                  ["README.md"                      (render "README.md" data)]
                  [".gitignore"                     (render ".gitignore")]
                  ["dev.cljs.edn"                   (render "dev.cljs.edn" data)]
                  ["prod.cljs.edn"                  (render "prod.cljs.edn" data)]
                  ["package.json"                   (render "package.json" data)]
                  ["src/{{nested-dirs}}.cljs"       (render "core.cljs" data)]
                  ["test/{{nested-dirs}}_test.cljs" (render "core_test.cljs" data)]
                  ["resources/public/index.html"    (render "index.html" data)]
                  ["resources/public/style.css"     (render "style.css")])))

(defproject day04 "0.1.0"
  :description "Day 4: The Ideal Stocking Stuffer"
  :url "https://adventofcode.com/2015/day/4"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [digest "1.4.9"]]
  :main ^:skip-aot day04.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repl-options {:init-ns day04.solutions}
  :plugins [[lein-ltest "0.4.0"]])

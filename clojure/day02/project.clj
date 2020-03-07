(defproject day02 "0.1.0"
  :description "Day 2: I Was Told There Would Be No Math"
  :url "https://adventofcode.com/2015/day/2"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot day02.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repl-options {:init-ns day02.solutions}
  :plugins [[lein-ltest "0.4.0"]])

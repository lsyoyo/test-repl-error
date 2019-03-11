(ns test-error.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [test-error.core-test]))

(doo-tests 'test-error.core-test)


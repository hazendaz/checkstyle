package com.puppycrawl.tools.checkstyle.checks.sizes.executablestatementcount;

/* Config:
 * max = 0
 * tokens = METHOD_DEF
 */

public class InputExecutableStatementCountStaticInit {
    // STATIC_INIT
    static { // violation
        int i = 1;
        if (System.currentTimeMillis() == 0) {
        } else if (System.currentTimeMillis() == 0) {
        } else {
        }
    }
}

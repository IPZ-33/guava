
package main.java.fit.lab.file;

import fit.lab.IOUtils;

public enum StandardDeleteOption implements DeleteOption {

        OVERRIDE_READ_ONLY;

        public static boolean overrideReadOnly(final DeleteOption[] options) {
        if (IOUtils.length(options) == 0) {
            return false;
        }
        for (final DeleteOption deleteOption : options) {
            if (deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }

}

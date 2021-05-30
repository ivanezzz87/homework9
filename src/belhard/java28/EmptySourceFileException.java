package belhard.java28;

import java.io.IOException;

public class EmptySourceFileException extends IOException {
    public EmptySourceFileException(String message) {
        super ( message );
    }
}

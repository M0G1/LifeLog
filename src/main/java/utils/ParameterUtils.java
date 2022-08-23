package utils;

public class ParameterUtils {
    public final static String POSIX_PREFIX = "-";

    public final static String GNU_PREFIX = "--";

    public static String toPosixName(String name) {
        return POSIX_PREFIX + name;
    }

    public static String toGnuName(String name) {
        return GNU_PREFIX + name;
    }

    public static String[] addPosixNameVariant(String name) {
        return new String[]{name, toPosixName(name)};
    }

    public static String[] addGnuNameVariant(String name) {
        return new String[]{name, toGnuName(name)};
    }

    public String[] addPosixAndGnuNameVariants(String name) {
        return new String[]{name, toPosixName(name), toGnuName(name)};
    }
}

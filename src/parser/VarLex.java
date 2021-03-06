package parser;

import java.lang.*;

/**
 * @author Marianna Bisyarina (bisyarinamariashka@gmail.com)
 */
public class VarLex<T extends Number<T>> extends Lexem <T> {

    public final String name;

    public VarLex(String s) {
        super(LexemType.VARIABLE);

        name = s;
    }

    public String getName() {
        return name;
    }

    @Override
    public LexemType getType() {
        return super.getType();
    }

    @Override
    public String toString() {
        return "Variable: " + name;
    }
}

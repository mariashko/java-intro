/**
 * @author Marianna Bisyarina (bisyarinamariashka@gmail.com)
 */
public class NumLex extends Lexem {
    public final int value;

    public NumLex(int num) {
        super(LexemType.CONST);

        value = num;
    }

    public int getValue() {
        return value;
    }

    @Override
    public LexemType getType() {
        return super.getType();
    }
}

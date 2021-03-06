package by.epamtc.degtyarovea.entity;

import java.util.Objects;

public class Lexeme extends TextComponent {

    private String lexeme;

    public Lexeme(String lexeme, TextComponentType type) {
        super(type);
        this.lexeme = lexeme;
    }

    public String text() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lexeme lexeme1 = (Lexeme) o;
        return Objects.equals(lexeme, lexeme1.lexeme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lexeme);
    }

    @Override
    public String toString() {
        return "Lexeme{" +
                "lexeme='" + lexeme + '\'' +
                '}';
    }
}

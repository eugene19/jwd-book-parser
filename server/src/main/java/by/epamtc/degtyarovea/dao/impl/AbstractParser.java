package by.epamtc.degtyarovea.dao.impl;

import by.epamtc.degtyarovea.entity.TextComponent;

public abstract class AbstractParser {

    private AbstractParser nextParser;

    public AbstractParser(AbstractParser nextParser) {
        this.nextParser = nextParser;
    }

    public TextComponent parseNext(String text) {
        if (nextParser == null) {
            return null;
        }

        return nextParser.parse(text);
    }

    public abstract TextComponent parse(String text);
}

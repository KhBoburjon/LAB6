package com.lab6.Factory;

public class Editor {
    private String content;
    public EditorStates createState()
    {
        return new EditorStates(content);
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public void restoreContent(EditorStates state)
    {
        this.content = state.getContent();
    }
    public String getContent()
    {
        return content;
    }
}

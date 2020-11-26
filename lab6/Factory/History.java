package com.lab6.Factory;
import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorStates> states = new ArrayList<>();

    public void push(EditorStates state)
    {
        states.add(state);
    }
    public EditorStates pop()
    {
        var lastIndex = states.size() - 1;
        var lastContent = states.get(lastIndex);
        states.remove(lastContent);
        return lastContent;
    }
}

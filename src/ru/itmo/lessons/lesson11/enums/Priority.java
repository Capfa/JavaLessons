package ru.itmo.lessons.lesson11.enums;
//enum может создаваться со свойствами,конструкторами и методамибвключая гетеры и сетеры
//можно не ставить ; после последнего элемента перечислениябесли после перечисления нет свойств,методов и конструкторов
public enum Priority {
    HIGH(10), MIDDLE(5), LOW(1);
    private int code;
    Priority(int code){
        this.code=code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

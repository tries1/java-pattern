package command;

public class main {
    public static void main(String[] args) {
        Command lampOnCommand = new LampOnCommand(new Lamp());
        Command alarmStartCommand = new AlarmStartCommand(new Alarm());

        Button button1 = new Button(lampOnCommand); // 램프 켜는 Command 설정
        button1.pressed(); // 램프 켜는 기능 수행

        Button button2 = new Button(alarmStartCommand); // 알람 울리는 Command 설정
        button2.pressed(); // 알람 울리는 기능 수행
        button2.setCommand(lampOnCommand); // 다시 램프 켜는 Command로 설정
        button2.pressed(); // 램프 켜는 기능 수행
    }
}

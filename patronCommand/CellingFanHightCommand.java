public class CellingFanHightCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;
    public CellingFanHightCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }
    public void undo() {
        if (prevSpeed == CellingFan.HIGHT) {
            cellingFan.high();
        } else if (prevSpeed == CellingFan.MEDIUM) {
            cellingFan.medium();
        } else if (prevSpeed == CellingFan.LOW) {
            cellingFan.low();
        } else if (prevSpeed == CellingFan.OFF) {
            cellingFan.off();
        }
    }
}
package lesson.iterative.tasks;

import arachne.lib.ArachneRobot;
import arachne.lib.game.GameState;

public class Robot extends ArachneRobot {
    public static void main(String[] args) {
		startRobot(Robot::new);
    }
    
    @Override
	protected void initialize() {
	}
	
	@Override
	protected void onStateChange(GameState oldState, GameState newState) {
	}

	@Override
	protected void execute(GameState state) {
    }
}


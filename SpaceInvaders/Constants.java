package SpaceInvaders;

import java.awt.*;

public interface Constants {
  int TICKS_PER_SECOND = 30;

  int GAME_BOARD_WIDTH = 500;
  int GAME_BOARD_HEIGHT = 400;

  int ALIENS_PER_ROW = 13;
  int ALIEN_ROWS = 5;
  int ALIEN_HORIZONTAL_SPACING = 10;
  int ALIEN_VERTICAL_SPACING = 5;
  int ALIEN_HORIZONTAL_PADDING = 95;
  int ALIEN_VERTICAL_PADDING = 20;
  int ALIEN_SHOOT_EVERY_N_TICKS = 30;

  int ALIEN_SIZE = 15;
  int ALIEN_SHIFT_PER_LEVEL = ALIEN_VERTICAL_SPACING;

  int BULLET_SPEED_PER_TICK = 8;
  int ALIEN_SPEED_PER_TICK = 2;
  int PLAYER_SPEED_PER_TICK = 5;

  int PLAYER_LENGTH = 50;
  int PLAYER_HEIGHT = 10;
  int PLAYER_PADDING = 0;

  int BULLET_SIZE = 5;

  int SCORE_DISTANCE_FROM_SIDE = 30;

  Color BACKGROUND_COLOR = Color.ORANGE;
  Color FOREGROUND_COLOR = Color.WHITE;
  Color BULLET_COLOR = Color.BLACK;
}

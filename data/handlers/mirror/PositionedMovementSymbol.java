	public void mirror() {
		assert canMirror() : "Precondition failed: canMirror()";

		int newRotation = getSymbol().getRotation();
		if ((MovementBaseSymbol.TOUCH_MULTIPE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TOUCH_BETWEEN.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.GRASP_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.GRASP_BETWEEN.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.STRIKE_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.STRIKE_BETWEEN.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.BRUSH_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.BRUSH_BETWEEN.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.RUB_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.RUB_BETWEEN.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SURFACE_BETWEEN.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SQUEEZE_LARGE_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SQUEEZE_SMALL_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.FLICK_LARGE_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.FLICK_SMALL_MULTIPLE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))) {
			if (getSymbol().getRotation() == 2) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 2;
			}
		} else if ((MovementBaseSymbol.SURFACE_SYMBOLS.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SQUEEZE_FLICK_ALTERNATING.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_ALTERNATING_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_ALTERNATING_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HINGE_MOVEMENT_SIDE_TO_SIDE_SCISSORS.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TRIPPLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TRIPPLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TRAVEL_SHAKING_WALL_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.SINGLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TRIPLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TRIPLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.TRAVEL_SHAKING_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ARROWHEADS_SMALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ARROWHEADS_LARGE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))) {
			if (getSymbol().getRotation() == 2) {
				newRotation = 8;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 6;
			} else if (getSymbol().getRotation() == 6) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 7) {
				newRotation = 3;
			} else if (getSymbol().getRotation() == 8) {
				newRotation = 2;
			}
		} else if ((MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol()
				.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_MEDIUM.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_LARGEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_MEDIUM.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_LARGEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))) {
			if (getSymbol().getRotation() == 2) {
				newRotation = 8;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 6;
			} else if (getSymbol().getRotation() == 6) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 8) {
				newRotation = 2;
			}
		} else if ((MovementBaseSymbol.CURVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.WAVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_SINGLE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_DOUBLE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_ALTERNATING_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.CURVE_HITS_CHEST.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_CHEST.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_CHEST.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.WAVE_HITS_CHEST.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_SINGLE_HITS_CHEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_DOUBLE_HITS_CHEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_ALTERNATIVE_HITS_CHEST.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 2;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 1;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 3;
			}
		} else if ((MovementBaseSymbol.CURVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.CURVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_CEILING_2_HUMPS_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_CEILING_2_HUMPS_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_CEILING_3_HUMPS_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_CEILING_3_HUMPS_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_CEILING_SMALL_SINGLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_CEILING_LARGE_SINGLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_CEILING_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_CEILING_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.WAVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.WAVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_SINGLE_HITS_CEILING.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_DOUBLE_HITS_CEILING.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_ALTERNATING_HITS_CEILING.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.CURVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.CURVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_FLOOR_2_HUMPS_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_FLOOR_2_HUMPS_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_FLOOR_3_HUMPS_SMALL.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.HUMP_HITS_FLOOR_3_HUMPS_LARGE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_FLOOR_SMALL_SINGLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_FLOOR_LARGE_SINGLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_FLOOR_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.LOOP_HITS_FLOOR_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.WAVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.WAVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol().equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_SINGLE_HITS_FLOOR.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_DOUBLE_HITS_FLOOR.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.ROTATION_ALTERNATING_HITS_FLOOR.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 2;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 1;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 8;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 5) {
				newRotation = 6;
			} else if (getSymbol().getRotation() == 6) {
				newRotation = 5;
			} else if (getSymbol().getRotation() == 7) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 8) {
				newRotation = 3;
			}
		} else if ((MovementBaseSymbol.WRIST_CIRCLE_HITS_WALL_SINGLE.getIswaSymbol().getBaseSymbol()
				.equals(getBaseSymbol()) && getSymbol().getRotation() < 5)
				|| (MovementBaseSymbol.WRIST_CIRCLE_HITS_WALL_DOUBLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()) && getSymbol().getRotation() < 5)) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 2;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 1;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 3;
			}
		} else if ((MovementBaseSymbol.FINGER_CIRCLES_HITS_WALL_SINGLE.getIswaSymbol().getBaseSymbol()
				.equals(getBaseSymbol()))
				|| (MovementBaseSymbol.FINGER_CIRCLES_HITS_WALL_DOUBLE.getIswaSymbol().getBaseSymbol()
						.equals(getBaseSymbol()))) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 3;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 1;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 2;
			} else if (getSymbol().getRotation() == 5) {
				newRotation = 6;
			} else if (getSymbol().getRotation() == 6) {
				newRotation = 5;
			} else if (getSymbol().getRotation() == 7) {
				newRotation = 8;
			} else if (getSymbol().getRotation() == 8) {
				newRotation = 7;
			}
		} else if (getSymbol().getBaseSymbol()
				.equals(MovementBaseSymbol.FINGER_CIRCLES_WALL_SINGLE.getIswaSymbol().getBaseSymbol())
				|| getSymbol().getBaseSymbol()
						.equals(MovementBaseSymbol.FINGER_CIRCLES_WALL_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			newRotation += 4;
			if (newRotation > 8) {
				newRotation -= 8;
			}
		} else {
			newRotation += 8;
			if (newRotation > 16) {
				newRotation -= 16;
			}
		}

		setFillAndRotation(getSymbol().getFill(), newRotation);

	}

	public void switchPlane() {

		List<Symbol> allVariations = new ArrayList<Symbol>();
		int newFill = getSymbol().getFill();
		int newRotation = getSymbol().getRotation();

		if (getBaseSymbol()
				.equals(MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 3 || getSymbol().getRotation() == 7) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
			} else {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 3 || getSymbol().getRotation() == 7) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
			} else {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 3 || getSymbol().getRotation() == 7) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
			} else {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGEST.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 3 || getSymbol().getRotation() == 7) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGEST.getIswaSymbol()
								.getBaseSymbol());
			} else {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.SINGLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.SINGLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 9) {
				newRotation = 2;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 13) {
				newRotation = 3;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 5) {
				newRotation = 4;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else {
				newRotation -= 2;
				if (getSymbol().getRotation() < 9 && newRotation <= 0) {
					newRotation += 8;
				} else if (getSymbol().getRotation() >= 9 && newRotation <= 8) {
					newRotation += 8;
				}
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol().equals(MovementBaseSymbol.HUMP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.HUMP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 9) {
				newRotation = 2;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.HUMP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 13) {
				newRotation = 3;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.HUMP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 5) {
				newRotation = 4;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.HUMP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else {
				newRotation -= 2;
				if (getSymbol().getRotation() < 9 && newRotation <= 0) {
					newRotation += 8;
				} else if (getSymbol().getRotation() >= 9 && newRotation <= 8) {
					newRotation += 8;
				}
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.HUMP_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol().equals(MovementBaseSymbol.LOOP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.LOOP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 9) {
				newRotation = 2;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.LOOP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 13) {
				newRotation = 3;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.LOOP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 5) {
				newRotation = 4;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.LOOP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else {
				newRotation -= 2;
				if (getSymbol().getRotation() < 9 && newRotation <= 0) {
					newRotation += 8;
				} else if (getSymbol().getRotation() >= 9 && newRotation <= 8) {
					newRotation += 8;
				}
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.LOOP_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.WAVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 9) {
				newRotation = 2;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.WAVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 13) {
				newRotation = 3;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.WAVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else if (getSymbol().getRotation() == 5) {
				newRotation = 4;
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.WAVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());
			} else {
				newRotation -= 2;
				if (getSymbol().getRotation() < 9 && newRotation <= 0) {
					newRotation += 8;
				} else if (getSymbol().getRotation() >= 9 && newRotation <= 8) {
					newRotation += 8;
				}
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.WAVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
			}
		} else if (getBaseSymbol().equals(MovementBaseSymbol.SHAKING_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SHAKING_PARALLEL_FLOOR.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 15;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 11;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 3;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.HUMP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 15;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 11;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 3;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.LOOP_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 15;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 11;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 3;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 15;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 11;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 3;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CURVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			newRotation += 1;
			newRotation = newRotation % 8 + 1;
			if (getSymbol().getRotation() >= 9) {
				newRotation += 8;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.HUMP_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			newRotation += 1;
			newRotation = newRotation % 8 + 1;
			if (getSymbol().getRotation() >= 9) {
				newRotation += 8;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.LOOP_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			newRotation += 1;
			newRotation = newRotation % 8 + 1;
			if (getSymbol().getRotation() >= 9) {
				newRotation += 8;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			newRotation += 1;
			newRotation = newRotation % 8 + 1;
			if (getSymbol().getRotation() >= 9) {
				newRotation += 8;
			}
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.SHAKING_PARALLEL_FLOOR.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SHAKING_WALL_PLANE.getIswaSymbol().getBaseSymbol());
		}

		validVariations.clear();
		validVariations.addAll(allVariations);
		if (!isValidRotation(newRotation) || !isValidFill(newFill)) {
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		}
		setFillAndRotation(newFill, newRotation);
	}

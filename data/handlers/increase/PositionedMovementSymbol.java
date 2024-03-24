	public void increase() {
		assert canIncrease() : "Precondition failed: canIncrease()";
		MovementBaseSymbol movementBaseSymbol = MovementBaseSymbol.getMovementBaseSymbol(getSymbol().getBaseSymbol());

		List<Symbol> allVariations = new ArrayList<Symbol>();

		if (MovementBaseSymbol.TOUCH_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TOUCH_MULTIPE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (MovementBaseSymbol.TOUCH_MULTIPE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TOUCH_MULTIPE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.TOUCH_BETWEEN.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TOUCH_BETWEEN.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.GRASP_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.GRASP_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 1, 5, 1, 1, 1, 22, 10));
		} else if (MovementBaseSymbol.GRASP_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.GRASP_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.GRASP_BETWEEN.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.GRASP_BETWEEN.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.STRIKE_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.STRIKE_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 1, 8, 1, 1, 1, 28, 13));
		} else if (MovementBaseSymbol.STRIKE_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.STRIKE_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.STRIKE_BETWEEN.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.STRIKE_BETWEEN.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.BRUSH_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BRUSH_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 1, 11, 1, 1, 1, 26, 12));
		} else if (MovementBaseSymbol.BRUSH_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BRUSH_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.BRUSH_BETWEEN.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BRUSH_BETWEEN.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.RUB_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.RUB_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 1, 14, 1, 1, 1, 28, 14));
		} else if (MovementBaseSymbol.RUB_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.RUB_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.RUB_BETWEEN.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.RUB_BETWEEN.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.SQUEEZE_LARGE_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SQUEEZE_LARGE_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 2, 2, 1, 1, 1, 18, 8));
		} else if (MovementBaseSymbol.SQUEEZE_SMALL_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SQUEEZE_SMALL_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 2, 2, 2, 1, 1, 14, 6));
		} else if (MovementBaseSymbol.SQUEEZE_LARGE_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SQUEEZE_LARGE_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.SQUEEZE_SMALL_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SQUEEZE_SMALL_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());

		} else if (MovementBaseSymbol.SQUEEZE_SEQUENTIAL.equals(movementBaseSymbol) && getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SQUEEZE_SEQUENTIAL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.FLICK_LARGE_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FLICK_LARGE_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 2, 5, 1, 1, 1, 18, 8));
		} else if (MovementBaseSymbol.FLICK_SMALL_SINGLE.equals(movementBaseSymbol)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FLICK_SMALL_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setSymbol(new Symbol(2, 2, 5, 2, 1, 1, 14, 6));
		} else if (MovementBaseSymbol.FLICK_LARGE_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FLICK_LARGE_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.FLICK_SMALL_MULTIPLE.equals(movementBaseSymbol) && getSymbol().getFill() == 1) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FLICK_SMALL_MULTIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(2, getSymbol().getRotation());
		} else if (MovementBaseSymbol.FLICK_SEQUENTIAL.equals(movementBaseSymbol) && getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FLICK_SEQUENTIAL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_LARGE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 5) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_LARGE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 4) {
				setFillAndRotation(5, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_SMALL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 5) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_SMALL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 4) {
				setFillAndRotation(5, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_UP_SEQUENTIAL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_UP_SEQUENTIAL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_DOWN_SEQUENTIAL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_DOWN_SEQUENTIAL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_ALTERNATING_LARGE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_ALTERNATING_LARGE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_ALTERNATING_SMALL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_UP_DOWN_ALTERNATING_SMALL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.HINGE_MOVEMENT_SIDE_TO_SIDE_SCISSORS.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HINGE_MOVEMENT_SIDE_TO_SIDE_SCISSORS.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(3, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(4, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_WALL_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(4, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(5, getSymbol().getRotation());
			}
		} else if (MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_FLOOR_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			if (getSymbol().getFill() == 1) {
				setFillAndRotation(2, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 2) {
				setFillAndRotation(4, getSymbol().getRotation());
			} else if (getSymbol().getFill() == 3) {
				setFillAndRotation(5, getSymbol().getRotation());
			}
		} else if ((MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_SMALL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.SINGLE_WRIST_FLEX_WALL_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.TRAVEL_ROTATION_SINGLE_WALL_PLANE_FILLED_ARROW.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_WALL_PLANE_FILLED_ARROW.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.TRAVEL_ROTATION_SINGLE_WALL_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.TRAVEL_ROTATION_SINGLE_FLOOR_PLANE_FILLED_ARROW.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_FLOOR_PLANE_FILLED_ARROW.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.TRAVEL_ROTATION_SINGLE_FLOOR_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.TRAVEL_ARM_SPIRAL_WALL_PLANE_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ARM_SPIRAL_WALL_PLANE_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.TRAVEL_ARM_SPIRAL_WALL_PLANE_DOUBLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ARM_SPIRAL_WALL_PLANE_TRIPLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.SINGLE_WRIST_FLEX_FLOOR_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ROTATION_SINGLE_WALL_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.LOOP_WALL_PLANE_SMALL.equals(movementBaseSymbol) && getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_WALL_PLANE_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ROTATION_SINGLE_HITS_FRONT_WALL.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ROTATION_SINGLE_HITS_CHEST.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_CHEST.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ROTATION_SINGLE_HITS_CEILING.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_CEILING.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ROTATION_SINGLE_HITS_FLOOR.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_FLOOR.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ROTATION_SINGLE_FLOOR_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ARM_CIRCLE_WALL_SMALL_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ARM_CIRCLE_WALL_MEDIUM_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_SINGLE.equals(movementBaseSymbol))) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_SINGLE.equals(movementBaseSymbol))) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_SINGLE.equals(movementBaseSymbol))) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.WRIST_CIRCLE_FRONT_WALL_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WRIST_CIRCLE_FRONT_WALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.WRIST_CIRCLE_HITS_WALL_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WRIST_CIRCLE_HITS_WALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.FINGER_CIRCLES_WALL_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FINGER_CIRCLES_WALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.FINGER_CIRCLES_HITS_WALL_SINGLE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.FINGER_CIRCLES_HITS_WALL_DOUBLE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if ((MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.equals(movementBaseSymbol)
				&& getSymbol().getFill() < 4)) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		}

	}

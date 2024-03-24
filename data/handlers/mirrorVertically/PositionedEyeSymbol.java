	public void mirrorVertically() {
		assert canMirrorVertically() : "Precondition failed: canMirror()";

		int newLeftEyeRotation = (getSymbol().getRotation() + 4);

		if (getSymbol().getBaseSymbol()
				.equals(EyesBaseSymbol.EYEGAZE_CURVED_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			newLeftEyeRotation += 4;

			if (newLeftEyeRotation > 16) {
				newLeftEyeRotation -= 16;
			}

		} else {
			if (newLeftEyeRotation > 8) {
				newLeftEyeRotation -= 8;
			}
		}
		setFillAndRotation(getSymbol().getFill(), newLeftEyeRotation);

	}

	public void mirrorVertically() {
		assert canMirrorVertically() : "Precondition failed: canMirrorVertically()";

		int newFill = getSymbol().getFill();
		int newRotation = getSymbol().getRotation();

		if (DynamicsBaseSymbol.TENSE.getIswaSymbol().getBaseSymbol().equals(getSymbol().getBaseSymbol())
				|| DynamicsBaseSymbol.RELAXED.getIswaSymbol().getBaseSymbol().equals(getSymbol().getBaseSymbol())) {
			if (newFill <= 2) {
				newFill = (newFill % 2) + 1;
			} else {
				newFill = (newFill % 2) + 3;
			}
		} else {
			if (newRotation == 1) {
				newRotation = 5;
			} else if (newRotation == 2) {
				newRotation = 4;
			} else if (newRotation == 4) {
				newRotation = 2;
			} else if (newRotation == 5) {
				newRotation = 1;
			} else if (newRotation == 6) {
				newRotation = 8;
			} else if (newRotation == 8) {
				newRotation = 6;
			}
		}

		setFillAndRotation(newFill, newRotation);
	}

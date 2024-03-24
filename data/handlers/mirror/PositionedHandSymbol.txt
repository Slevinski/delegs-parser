	public void mirror() {
		assert canMirror() : "Precondition failed: canMirror()";

		int currenRotation = getSymbol().getRotation();
		int nextRotation = (currenRotation + 8) % 16;

		if (nextRotation == 0) {
			nextRotation = 16;
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);

	}

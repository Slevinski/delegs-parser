	public void mirror() {
		assert canMirror() : "Precondition failed: canMirror()";

		int newRotation = getSymbol().getRotation();
		int newFill = this.getSymbol().getFill();
		// we know we have 4 fills if we can mirror
		if (DynamicsBaseSymbol.getDynamicsBaseSymbol(this.getSymbol().getBaseSymbol()).getValidFills().contains(4)) {
			if (this.getSymbol().getFill() == 1 || this.getSymbol().getFill() == 3) {
				newFill++;
			} else if (this.getSymbol().getFill() == 2 || this.getSymbol().getFill() == 4) {
				newFill--;
			}
		} else {
			if (getSymbol().getRotation() == 2) {
				newRotation = 8;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 7;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 6;
			} else if (getSymbol().getRotation() == 6) {
				newRotation = 2;
			} else if (getSymbol().getRotation() == 7) {
				newRotation = 3;
			} else if (getSymbol().getRotation() == 8) {
				newRotation = 4;
			}
		}

		setFillAndRotation(newFill, newRotation);
	}

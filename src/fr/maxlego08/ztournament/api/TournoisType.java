package fr.maxlego08.ztournament.api;

public enum TournoisType {

	V1(1),
	V2(2),
	V3(3),
	V4(4),
	V5(5),
	V6(6),
	V7(7),
	V8(8),
	V9(9),
	V10(10),
	V11(11),
	V12(12),
	V13(13),
	V14(14),
	V15(15),
	V16(16),
	V17(17),
	V18(18),
	V19(19),
	V20(20),
	
	;
	
	private final int max;

	private TournoisType(int max) {
		this.max = max;
	}
	
	public int getMax() {
		return max;
	}
	
}

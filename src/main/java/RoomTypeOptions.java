public enum RoomTypeOptions {
        SINGLE(1),
        DOUBLE(2),
        KING(4),
        BOARDROOM(50),
        AUDITORIUM(80),
        BANQUET(15),
        PRIVATE_DINING_ROOM(12),
        OPEN_DINING_ROOM(30);

        private final int capacity;

        RoomTypeOptions(int capacity) {
                this.capacity = capacity;
        }

        public int getValue() {
                return capacity;
        }
}




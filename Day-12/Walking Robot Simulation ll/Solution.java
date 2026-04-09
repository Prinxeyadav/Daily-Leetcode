class Robot {

  
        private int width ;
        private int height ;
        private int pos = 0 ;
        private int total ;
        private boolean moved = false ;

        public Robot(int width, int height) {
            this.width = width ;
            this.height = height ;
            this.total = 2 * (width + height -2);
        }
        
    
    
    public void step(int num) {
        moved = true ;
        pos = (pos + num) % total ;

        
    }
    
    public int[] getPos() {
       if (pos < width ) return new int[] {pos, 0} ;
       if (pos < width + height - 1) return new int[] {width - 1, pos - (width - 1)};
       if (pos < 2 * width + height - 2) return new int[]{width - 1 -(pos - (width + height - 2)), height -1};

       return new int[] {0, height - 1 - (pos - (2 * width + height - 3))};
    }
    
    public String getDir() {

        if (moved && pos == 0 ) return "South";

        if (!moved && pos == 0) return "East";

        if (pos >= 1 && pos < width) return "East";

        if (pos >= width && pos  < width + height - 1) return "North";
        if (pos >= width + height - 1 && pos < 2 * width + height -2) return "West" ;
       

        return "South";
        
    }
}
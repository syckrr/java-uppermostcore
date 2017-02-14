//define a relativeview 
int maxx= getWindowManager().getDefaultDisplay().getWidth()/2;
int maxy= getWindowManager().getDefaultDisplay().getWidth()/2;
int minx= getWindowManager().getDefaultDisplay().getWidth()/15;
int miny= getWindowManager().getDefaultDisplay().getWidth()/15;
  
int btnsayi = rand.nextInt(10);
            Button btn = new Button(getApplicationContext()); //we create a button in this lane bcz:if we don't do this in there and write in while loop,there is no starting x and y values
            btn.setId(1);
            btn.setTag(1);
            //btn.setTag(i);
                ywx = rand.nextInt(maxx) + minx;
                yhy = rand.nextInt(maxx) + minx;
                yx = rand.nextInt(maxx) + minx;
                yy = rand.nextInt(maxy) + miny;
            btn.setTranslationX(yx);
            btn.setTranslationY(yy);
            btn.setWidth(5);//ywx
            btn.setHeight(100);//yhy
            rv.addView(btn); //look first lane
            tempx=yx;
            tempy=yy;
            temphy=yhy;
            tempwx=ywx;
            yx=0;
            yy=0;
            yhy=0;
            ywx=0;
            for (i = 2; i <= btnsayi; i++) { //btnsayi
                btn = new Button(getApplicationContext());
                btn.setId(i);
                btn.setTag(i);
                while (!((yy < tempy + temphy && yy + yhy > tempy) && (yx < tempx + tempwx && yx + ywx > tempx))) {
                    ywx = rand.nextInt(maxx) + minx;
                    yhy = rand.nextInt(maxx) + minx;
                    yx = rand.nextInt(maxx) + minx;
                    yy = rand.nextInt(maxy) + miny;
                }
                btn.setTranslationX(yx);
                btn.setTranslationY(yy);
                btn.setWidth(ywx);
                btn.setHeight(yhy);
                rv.addView(btn); //look first line
                tempx=yx;
                tempy=yy;
                temphy=yhy;
                tempwx=ywx;
                yx=0;
                yy=0;
                yhy=0;
                ywx=0;
            }

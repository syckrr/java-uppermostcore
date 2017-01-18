  int btnsayi = rand.nextInt(10);
            Button btn = new Button(getApplicationContext());
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
            //btn.setMaxWidth(getWindowManager().getDefaultDisplay().getWidth());
            rv.addView(btn);



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
                btn.setMaxWidth(getWindowManager().getDefaultDisplay().getWidth());
                rv.addView(btn);
                tempx=yx;
                tempy=yy;
                temphy=yhy;
                tempwx=ywx;
                yx=0;
                yy=0;
                yhy=0;
                ywx=0;
            }
1. 取扱説明
実行方法
①jarファイルから実行する方法
展開したフォルダ内に"carpark_g1853671.jar"というファイルが存在する。これをターミナルにてコマンド"java -jar carpark_g1853671.jar {駐車場の停車上限値}"と入力すると実行できる。例えば、"jar -jar carpark_g1853671.jar 5"と入力すると停車上限値5の駐車場を実現できる。

②コンパイル"javac"を用いて実行する方法
展開したフォルダ内に"Carpark.java"というjavaで書かれたプログラムが存在する。これをターミナルにてコマンド"javac Carpark.java"と入力し、コンパイルを行う。すると、同じフォルダ内に"Carpark.class","CarparkControl.class","Arrivals.class","Departures.class"というクラスファイルが新しく生成される。最後に、ターミナルにてコマンド"java Carpark {駐車場の停車上限値}"を入力すると実行できる。

2.実装したプログラムの説明
このプログラムは、"Carpark.java","CarparkControl.java","Departures.java","Arrivals.java"の4つのソースプログラムで作成されている。"Carpark.java"はmainメソッドで停車最大値をコマンドラインから獲得し、"CarparkControl.java"のメソッドCarparkControlで値をデータcapacityに格納している。その後、スレッドを動作させている。
スレッドは"Arrivals.java"と"Departures.java"の2つで、"Arrivals.java"が入場してくる車を想定したスレッド、"Departures.java"が退場していく車を想定したスレッドとなっている。それぞれのスレッドはランダム秒(1~5秒)の間隔で繰り返される。処理の内容は、"Arrivals.java"が同クラスのメソッドArrivalsを呼び出し、"CarparkControl.java"にあるメソッドarriveで処理を行う。処理の内容は、条件のspacesが0より大きい時、spacesをデクリメントするというものである。同様に"Departures.java"も"CarparkControl.java"のメソッドdepartで処理を行う。このスレッドの処理は、条件spacesがcapacityより小さい時、spacesをインクリメントするという内容である。このように、データspacesの値を書き換えを行うCarparkControlクラスがモニタの役割を果たしており、2つのスレッドで1つのデータを共有している。このままの状況では、排他制御が実装できていないので、排他制御を行うsynchronizedメソッドをarriveメソッドとdepartメソッドに付け加える。このようにすることでモニタの排他制御が実装されている。以上がこのプログラムの1連の流れである。

3.拡張した点など

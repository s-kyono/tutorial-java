# Java チュートリアル

## 主のスペック
- java経験 学生以来(つまり...未経験ってこと)

## チュートリアル記事
[Javaとは](https://azure.microsoft.com/ja-jp/resources/cloud-computing-dictionary/what-is-java-programming-language)
[Java入門](https://www.javadrive.jp/start/)

## 環境準備
``` sh
 docker build -t tutorial-java .
 docker run --name tutorial-java-container -d -v $(pwd):/workspace tutorial-java 
```

## Java Version
``` sh
java -version
openjdk version "21.0.4" 2024-07-16 LTS
OpenJDK Runtime Environment Corretto-21.0.4.7.1 (build 21.0.4+7-LTS)
OpenJDK 64-Bit Server VM Corretto-21.0.4.7.1 (build 21.0.4+7-LTS, mixed mode, sharing)
```

## Javaプログラム実行
```
java ./src/App.java 
```

## VScode コンテナアタッチでチュートリアル
 1. VSCodeを開いたらコマンドパレットで[開発コンテナー: 実行中のコンテナーにアタッチ...]を選択しリモートコンテナで接続する
 2. 開くプロジェクトディレクトリを`/workspace`を選択

## Javaとは
- Java は、世界中の数十億台のデバイスで実行されるマルチプラットフォームのオブジェクト指向プログラミング言語です。アプリケーション、スマートフォン オペレーティング システム、エンタープライズ ソフトウェア、および多くのよく知られているプログラムを強化します。20 年以上前に開発されたにもかかわらず、Java は現在、アプリ開発者にとって最も一般的なプログラミング言語です。
  - Java プログラミング言語を定義し、それを広く普及させた特徴を次に示します。Java は次のとおりです:

- Multiplatform: Java は、"「一度(プログラムを)書けば、どこでも実行できる」" (または WORA) というスローガンによってブランド化され、それは現在でも当てはまります。Windows オペレーティング システムなどの 1 つのプラットフォーム用に記述された Java プログラミング コードは、携帯電話 OS などの別のプラットフォームに簡単に転送でき、その逆も完全に書き換えられることはありません。Java プログラムがコンパイルされると、Java 仮想マシン (JVM) がインストールされている任意のオペレーティング システムで実行できる .class バイトコード ファイルがコンパイラによって作成されるため、Java は複数のプラットフォームで動作します。通常、iOS を含むほとんどの主要なオペレーティング システムに JVM をインストールするのは簡単ですが、必ずしもそうであるとは限りません。

- オブジェクト指向: Java は、最初のオブジェクト指向プログラミング言語の 1 つでした。オブジェクト指向プログラミング言語は、関数やコマンドではなく、クラスとオブジェクトに関するコードを整理します。C++、C#、Python、Ruby などの最新のプログラミング言語のほとんどは、オブジェクト指向です。

- これらの特性により、Java は、ソフトウェアやテクノロジ企業で非常に人気のある、汎用的で比較的簡単に学習できるプログラミング言語になります。コーディングやコンピューター プログラミングのキャリアを求めている場合は、Java の記述方法を知ることは貴重なスキルです。

## Java が作成されたのはいつですか?
- Java は、Sun Microsystems で働いていた 1995 年に James Gosling によって発明されました。リリース後すぐに人気が高まりましたが、Java は現在の強力なプログラミング言語としては始まりませんでした。

- Java になるものに関する開発は、1991 年に Sun Microsystems で開始されました。このプロジェクトは、最初はOak と呼ばれ、当初は対話型テレビ用に設計されていました。その時点で利用できるデジタル ケーブル テクノロジに対して、Oak が高度すぎると判断されたため、Gosling と彼のチームはプログラミング言語の作成に重点を置き、プロジェクトの名前をインドネシアのコーヒーの一種にちなんで Java 変更しました。Gosling は、より多くのデバイスがネットワーク化されるにつれて、移植性の低いプログラミング言語に向けて、予想していた問題に対処する機会として Java を見ました。

- Java は、C++ プログラミング言語に似た構文スタイルで設計されているため、プログラマが使用を開始したときに既に使い慣れているでしょう。"一度(プログラムを)書けば、どこでも実行できる" のスローガンを核として、プログラマは、Java インタープリター (Java 仮想マシンなど) がインストールされている他のプラットフォームで実行される 1 つのプラットフォームの Java コードを記述できます。1990 年代半ばのインターネットの登場と 新しいデジタル デバイスの普及に伴い、Java は真のマルチ プラットフォーム プログラミング言語として開発者にすぐに採用されました。

- Java の最初のパブリック バージョンである Java 1.0 は、1996 年にリリースされました。5 年間で、世界中に 250 万人の開発者がいました。現在、Java は Android モバイル オペレーティング システムからエンタープライズ ソフトウェアまで、あらゆる機能を提供しています。

## Java プログラミング言語は何に使用されますか?
- Java は、スマートフォンからスマートテレビまで、プラットフォームやさまざまな種類のデバイスで使用される非常に転送可能なプログラミング言語です。モバイル および Web アプリ、エンタープライズ ソフトウェア、モノのインターネット (IoT) デバイス、ゲーム、ビッグ データ、分散アプリケーション、クラウドベースのアプリケーションなどを作成するために使用されます。ここでは、Java でプログラミングされるアプリケーションの具体的な実際の例をいくつか示します。


|     |     | 
| --- | --- | 
| モバイルアプリ | モバイル アプリケーションの多くは、Java を使用して構築されています。Java は、安定したプラットフォームと汎用性のために、モバイル アプリ開発者に推奨される言語です。Java でコード化された人気のあるモバイル アプリには、Spotify、Signal、Cash アプリが含まれます。 | 
| Webアプリ | Java を使用してさまざまな Web アプリケーションが開発されています。Twitter と LinkedIn は最もよく知られています。 | 
| エンタープライズ ソフトウェア | エンタープライズ ソフトウェアは、大規模なグループまたは組織にサービスを提供することを目的としたソフトウェアです。これには、課金システムやサプライ チェーン管理プログラムなどのソフトウェアが含まれます。Java のスケーラビリティが高いため、エンタープライズ ソフトウェアを作成する開発者にとって魅力的な言語になります。 | 
| ゲーム | Java プログラミング言語で記述された人気のあるゲームには、オリジナルの Minecraft と RuneScape が含まれます。 | 
| IoT アプリケーション | IoT アプリケーションは、スマートテレビ、自動車、重い機械、作業施設など、あらゆる場所に存在し、Java はそれらの多くをプログラミングするために使用されます。Java は、プラットフォーム間でコードを簡単に転送できるため、IoT 開発者にとって人気な選択肢です。 | 

## JavaScript とは何ですか、そして Java の違いは何ですか?
- Java とは異なり、JavaScript には、Web ブラウザーを実行するためのスクリプトの作成という 1 つの機能しかありません。これらのスクリプトはインターネット上に出回っています。これらは、ブラウザーベースのゲーム、Web ページ アニメーション、ユーザー動作のログ記録、ポップアップ広告などに使用されます。基本的に、誰かがページを再読み込みせずに Web サイトで更新するものはすべて、JavaScript である可能性が最も高くなります。
- 先ほど説明したように、Java は Web サイト以外でも多く使用されています。

## Java はどのように動作しますか?
- 前述のように、Java はマルチプラットフォーム プログラミング言語です。つまり、ある OS 用に書き、別の OS で実行できます。どうしてこれが可能なのですか?
- Java コードは、まず Windows、Linux、macOS で使用できる Java 開発キットで記述されます。プログラマは Java プログラミング言語で記述し、このキットは、適切なソフトウェアを備えた任意のデバイスで読み取ることができるコンピューター コードに変換されます。これは、コンパイラと呼ばれるソフトウェアの一部で実現されます。コンパイラは、Java のような高レベルのコンピューター コードを受け取り、オペレーティング システムが認識するバイトコードと呼ばれる言語に変換します。
- その後、バイトコードは Java 仮想マシン (JVM) と呼ばれるインタープリターによって処理されます。JVM は、ほとんどのソフトウェアおよびハードウェア プラットフォームで使用でき、Java コードをあるデバイスから別のデバイスに転送できます。JAVA を実行するために、JVM はコードを読み込み、検証し、ランタイム環境を提供します。
- Java の移植性が高いことを考えると、多くの人がそれを書く方法を学びたいと思うのも無理はない。幸いなことに、Java の学習を開始するために利用できるリソースは多数あります。

## 起点となる *.javaには mainメソッドを定義しなければならない
- プログラム開始となる起点メソッドを定義しなければ、Javaは実行時にエラーとなる
``` java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```
- 実行
``` sh
java ./src/App.java 
# Hello
```

- mainを定義しない場合
``` java
public class App {
    public static void app(String[] args) {
        System.out.println("Hello");
    }
}
```
- 実行
``` sh
 java ./src/App.java 
error: can't find main(String[]) method in class: App
```
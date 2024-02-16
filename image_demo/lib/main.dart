import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(
  title: "App",
  home: MyApp(),
));

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Insert Image Demo',
          ),
        ),
        body: Center(
          child: Column(
            children: <Widget>[
              Image.asset('download.jpg'),
              // Image.asset
              Text(" This is demo of text and image in the flutter"),

              ElevatedButton(child: Text('Click Me'),
                style: ElevatedButton.styleFrom(
                  primary: Colors.orange,
                ),
                onPressed:() => Navigator.of(context)
                    .push(MaterialPageRoute(builder: (context) => const NewScreen()) ),)


            ], //<Widget>[]
          ), //Column
        ), //Center
      ),
    );
  }
}

class NewScreen extends StatefulWidget {
  const NewScreen({Key? key}) : super(key: key);

  @override
  State<NewScreen> createState() => _NewScreenState();
}

class _NewScreenState extends State<NewScreen> {


  @override
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.orange,
        title: const Text('New Screen'),
      ),
      body: Center(child: Text('This is your new screen'),
      ),
    );
  }
}


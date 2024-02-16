import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {



  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
          appBar: AppBar(
            title: const Text('Flutter Demo'),
          ),
          body: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget> [
                Container(
                    margin: EdgeInsets.only(top:8),
                    child: ElevatedButton(

                      child: Text(" Flat Button"),
                      onPressed: () { print("Hiiii");  },


                    )
                ),
                Container(
                  margin: EdgeInsets.only(top:8),
                  child: OutlinedButton(
                    child: Text(" Outline Button"),
                    onPressed: () { print("Hiiii outline");  },
                  ),




                ),
                Container(
                  margin: EdgeInsets.only(top:8),
                  child: IconButton(
                    onPressed: () { print("icon button pressed");  },
                    iconSize: 40,
                    icon: Icon(
                      Icons.email_outlined,
                    ),
                  ),
                ),
              ],
            ),
          )
      ),

    );
  }
}





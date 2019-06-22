$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("docStringDemo.feature");
formatter.feature({
  "line": 3,
  "name": "Doc String Demo",
  "description": "",
  "id": "doc-string-demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DocString"
    }
  ]
});
formatter.before({
  "duration": 2694714832,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Doc String parsing",
  "description": "",
  "id": "doc-string-demo;doc-string-parsing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a blog post named with Markdown body",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 8,
    "value": "Doc Strings are handy for passing a larger piece of text to a step definition."
  }
});
formatter.match({
  "location": "DocStringDemo.a_blog_post_named_with_Markdown_body(String)"
});
formatter.result({
  "duration": 78359004,
  "status": "passed"
});
formatter.after({
  "duration": 75765060,
  "status": "passed"
});
});
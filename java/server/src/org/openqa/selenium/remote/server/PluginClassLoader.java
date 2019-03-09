package org.openqa.selenium.remote.server;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginClassLoader extends URLClassLoader {

  public PluginClassLoader(URL[] urls) {
    super(urls);
  }

  public void addFile(String path) throws MalformedURLException {
    String urlFile = "file://" + path;
    addURL(new URL(urlFile));
  }

}

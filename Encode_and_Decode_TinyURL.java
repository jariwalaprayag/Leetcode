public class Codec {
    HashMap<Integer, String> urls = new HashMap<Integer, String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Random rand = new Random();
        int key = rand.nextInt();
        while(urls.containsKey(key))
            key = rand.nextInt();
        urls.put(key, longUrl);
        return "http://tinyurl.com/" + String.valueOf(key);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] temp = shortUrl.split("/");
        int key = Integer.parseInt(temp[temp.length - 1]);
        return urls.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
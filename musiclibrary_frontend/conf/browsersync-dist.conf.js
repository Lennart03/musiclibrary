const conf = require('./gulp.conf.js');

module.exports = function () {
  return {
    server: {
      baseDir: [
        conf.paths.dist
      ]
    },
    open: false
  };
};
